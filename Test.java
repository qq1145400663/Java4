package gongzi;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("KZL");//��������
        graduate.setmoney(6000, 1500);//����ÿѧ�ڵķ���,�¹���
        System.out.println("KZLѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("KZL������Ϊ��"+graduate.getsalary()); 
        System.out.println("KZL��˰�"+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2000);//����ÿѧ�ڵķ���,�¹���
        System.out.println("SYWѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("SYW������Ϊ��"+graduate.getsalary()); 
        System.out.println("SYW��˰�"+((graduate.getsalary()*0.25)-1005));	
        }
        
        
}

