package nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest {
    //fileChannel读取数据到buffer中
    public static void main(String[] args)  {
        //创建FileChannel,通过文件创建
        FileChannel channel = null;
        try {
            RandomAccessFile randomAccessFile =
                    new RandomAccessFile("C:\\Users\\ocean\\Desktop\\shell笔记.txt", "rw");

            channel = randomAccessFile.getChannel();
            //创建Buffer缓存区
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            //读取数据到buffer中

            int read = channel.read(byteBuffer);//读到-1表示结束
            System.out.println("read = " + read);
            while (read != -1) {
                System.out.println("读取了：" + read);
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    System.out.print( byteBuffer.toString());
                }
                byteBuffer.clear();
                 read = channel.read(byteBuffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (channel!=null){
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
