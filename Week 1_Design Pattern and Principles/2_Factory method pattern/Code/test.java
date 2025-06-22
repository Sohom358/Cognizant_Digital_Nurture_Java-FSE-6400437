public class test {
    public static void main(String args[])
    {
        Factory obj;

        obj=new Word();
        document doc1=obj.createDocument();
        doc1.accessing();

        obj=new Pdf();
        document doc2=obj.createDocument();
        doc2.accessing();

        obj=new Excel();
        document doc3=obj.createDocument();
        doc3.accessing();
    }
    
}