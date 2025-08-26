public class shortestpath {
    public static float getpath(String str){
        int x =0;
        int y= 0;
        for(int i = 0; i < str.length(); i++){
            int dir = str.charAt(i);
            if(dir == 'n'){
                y++;
            }
            else if(dir == 's'){
                y--;
            }
            else if(dir == 'e'){
                x++;
            }
            else{
                x--;
            }
        }
        int x1 = x *x;
        int y1= y*y;
        return (float)(Math.sqrt(x1 + y1));
    }
    public static void main(String[] args) {
        String str  = "wneenesennn";
        getpath(str);
        System.out.println("The shortest path is: " + getpath(str));

    }
}
