package cn.liuawen.tank.net;

import java.util.List;
import java.util.UUID;

import cn.liuawen.tank.Dir;
import cn.liuawen.tank.Group;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class MsgDecoder extends ByteToMessageDecoder{

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		if(in.readableBytes() < 8) return;
		
		in.markReaderIndex();
		
		MsgType msgType = MsgType.values()[in.readInt()];
		int length = in.readInt();
		
		if(in.readableBytes()< length) {
			in.resetReaderIndex();
			return;
		} 
		
		byte[] bytes = new byte[length];
		in.readBytes(bytes);
		
		Msg msg = null;
		
		//reflection
		msg = (Msg)Class.forName("cn.liuawen.tank.net." + msgType.toString() + "Msg").getDeclaredConstructor().newInstance();
		/*switch(msgType) {
		case TankJoin:
			msg = new TankJoinMsg();
			break;
		case TankStartMoving:
			msg = new TankStartMovingMsg();
			break;
		case TankStop:
			msg = new TankStopMsg();
			break;
		case Tank
		default:
			break;
		}*/
		
		msg.parse(bytes);
		out.add(msg);
		
	}

}
