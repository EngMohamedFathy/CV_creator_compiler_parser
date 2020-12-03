

package formal_project;


public class Parser {
    
    public static boolean  syntax=true;
    public  static  enum type{E,S,N,J,P,C,H,b,d,t,OPN,CLS,EQL,QMA,EOF,a,c,e,f,g,h,j,v
                            ,k,l,m,n,o,p,q,w,x,y,z,r,u,i,s,one,two,three,four,five,sex,seven,eaght,nine,zero,sharta,underS};
    public static String msg;
    public static int lookAhead=0;
    
    public void error(){
        syntax=false;
    }
    public void eat(char ch){
        if(ch==msg.charAt(lookAhead)){
            lookAhead++;
            
        }else{
            error();
        }
        
    }
    public type getNextToken(){
        if(lookAhead==msg.length()){
            return type.EOF;
        }
        switch(msg.charAt(lookAhead)){
            case 'a': return type.a;
            case 'b': return type.b;
            case 'c': return type.c;
            case 'd': return type.d;
            case 'e': return type.e;
            case 'f': return type.f;
            case 'g': return type.g;
            case 'q': return type.q;
            case 'w': return type.w;
            case 'r': return type.r;
            case 't': return type.t;
            case 'y': return type.y;
            case 'u': return type.u;
            case 'i': return type.i;
            case 'o': return type.o;
            case 'p': return type.p;
            case 's': return type.s;
            case 'h': return type.h;
            case 'j': return type.j;
            case 'k': return type.k;
            case 'l': return type.l;
            case 'z': return type.z;
            case 'x': return type.x;
            case 'v': return type.v;
            case 'n': return type.n;
            case 'm': return type.m;
            case ';': return type.EOF;
            case ',': return type.QMA;
            case '[': return type.OPN;
            case ']': return type.CLS;
            case '=': return type.EQL;
            case '_': return type.underS;
            case '1': return type.one;
            case '2': return type.two;
            case '3': return type.three;
            case '4': return type.four;
            case '5': return type.five;
            case '6': return type.sex;
            case '7': return type.seven;
            case '8': return type.eaght;
            case '9': return type.nine;
            case '0': return type.zero;
            case '-': return type.sharta;
            case 'E': return type.E;
            case 'S': return type.S;
            case 'N': return type.N;
            case 'J': return type.J;
            case 'P': return type.P;
            case 'C': return type.C;
            case 'H': return type.H;
            default:error();return null;
        }
    }
    //////////////////////////////////////////////////////second code///////////////////////////
    public void S(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case E:
            case S:
            case N:
            case J:
            case P:
            case C:
            case H:
                A();eat('[');B();eat('=');C();D();eat(']');eat(';');break;
            default:
                error();
            
        }
    }
    /*Employment")
                || word.trim().equals("Education")
                || word.trim().equals("Skills")
                || word.trim().equals("Name")
                || word.trim().equals("Job")
                || word.trim().equals("Profile")
                || word.trim().equals("Hobby")
                || word.trim().equals("Pro_img")
                || word.trim().equals("Contact")
                || word.trim().equals("Emp_line1")
                || word.trim().equals("Emp_line2")
                || word.trim().equals("Emp_line3")
                || word.trim().equals("Edu_line1")
                || word.trim().equals("Edu_line2")
                || word.trim().equals("Edu_line3")
                || word.trim().equals("Sk_line1")
                || word.trim().equals("Sk_line2")
                || word.trim().equals("Sk_line3"));*/
    public void A(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case E:eat('E');A1();break;
            case S:eat('S');eat('k');A4();break;
            case N:eat('N');eat('a');eat('m');eat('e');break;
            case J:eat('J');eat('o');eat('b');break;
            case P:eat('P');eat('r');eat('o');A5();break;
            case C:eat('C');eat('o');eat('n');eat('t');eat('a');eat('c');eat('t');break;
            case H:eat('H');eat('o');eat('b');eat('b');eat('y');break; 
            default:
                error();
            
        }
    }
    public void A1(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case d:eat('d');eat('u');A3();break;
            case m:eat('m');eat('p');A2();break;
            default:
                error();
            
        }
    }
    public void A2(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case underS:eat('_');eat('l');eat('i');eat('n');eat('e');A6();break;
            case l:eat('l');eat('o');eat('y');eat('m');eat('e');eat('n');eat('t');break;
            default:
                error();
            
        }
    }
    public void A3(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case underS:eat('_');eat('l');eat('i');eat('n');eat('e');A7();break;
            case c:eat('c');eat('a');eat('t');eat('i');eat('o');eat('n');break;
            default:
                error();
            
        }
    }
    public void A4(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case underS:eat('_');eat('l');eat('i');eat('n');eat('e');A8();break;
            case i:eat('i');eat('l');eat('l');eat('s');break;
            default:
                error();
            
        }
    }
    public void A5(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case underS:eat('_');eat('i');eat('m');eat('g');break;
            case f:eat('f');eat('i');eat('l');eat('e');break;
            default:
                error();
            
        }
    }
    public void A6(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case one:eat('1');break;
            case two:eat('2');break;
            case three:eat('3');break;
            default:
                error();
            
        }
    }
    public void A7(){
        A6();
    }
    public void A8(){
        A6();
    }
    public void B(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case b:eat('b');eat('k');eat('c');eat('o');eat('l');eat('o');eat('r');break;
            case c:eat('c');eat('o');eat('l');eat('o');eat('r');break;
            case d:eat('d');eat('a');eat('t');eat('e');break;
            case t:eat('t');eat('e');eat('x');eat('t');break;
            case s:eat('s');eat('r');eat('c');break;
            default:
                error();
            
        }
    }
    public void C(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case OPN:
            case CLS:
            case sharta:
            case underS:
            case EOF:
            case QMA:
            case EQL:
                error();
            default:
                while(msg.charAt(lookAhead)!=',' && msg.charAt(lookAhead)!=']' ){
                    eat(msg.charAt(lookAhead));
                }
                break;
                
            
        }
    }
    public void D(){
        
        type nextToken=getNextToken();
        
        switch(nextToken){
            case QMA:eat(',');B();eat('=');C();break;
            case CLS:break;
            default:
                error();
            
        }
    }
    
}
