public class salixess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      char [][]letterV = {
          {'*','*',' ','*','*','*'},
          {' ','*',' ','*',' ',' '},
          {' ',' ','*','*',' ',' '},
           {' ',' ','*',' ',' '},
          
      };
      for (int i=0; i <letterV.length;i++){
          for (int j=0; j <letterV[i].length;j++){
              System.out.print(letterV[i][j]+"");
          };
          System.out.println();
      }
      }
    
}
