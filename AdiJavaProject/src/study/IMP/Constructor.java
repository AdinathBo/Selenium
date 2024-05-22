package study.IMP;

public class Constructor {
      int id;
      String name;
      float per;
      
      Constructor(){
    	  System.out.println("default constructor");
      }
      
      Constructor(int id,String name,float per){
    	  this.id=id;
    	  this.name=name;
    	  this.per=per;
    	  
    	  System.out.println(id);
    	  System.out.println(name);
    	  System.out.println(per);
      }     
}
