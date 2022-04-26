package nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest1 {
    public static void main(String[] args)throws Exception {
        //打开一个FileChannel
        RandomAccessFile randomAccessFile=new RandomAccessFile("C:\\Users\\ocean\\Desktop\\001.txt","rw");
        FileChannel channel = randomAccessFile.getChannel();
        //创建buffer对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        String data="com.ocean汉字";
        byteBuffer.clear();
        //存进缓存去
        byteBuffer.put(data.getBytes());
        byteBuffer.flip();
        //FileChannel完成最终判断
        while (byteBuffer.hasRemaining()){
             channel.write(byteBuffer);//循环调用，直到写完
            }
        channel.close();
    }
}
