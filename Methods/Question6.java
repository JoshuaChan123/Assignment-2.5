class Question6{
    public static void main(String[] args){
        displayBox(6,3);

    }

    public static void displayBox(int height,int width) {
        for(int i=0; i<width; i++){
            for(int a=0; a<height; a++){
                System.out.print("$");
            }
            System.out.println("");
        }
        
    }

}