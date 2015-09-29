
package votaciones;


public class Votaciones {

    public static void main(String[] args) {
      int lim;
        double vothom, votmuj;
        lim=(int)(Math.random()*400)+100;
        char votantes[][]= new char [2][lim];
        int aprobHombres=0,aprobMujeres=0,desapMujeres=0;
        for(int i=1;i<lim;i++){
        
            vothom= Math.random();
            votmuj= Math.random();

            if (vothom<=0.33 ){
                votantes [0][i]='1';
            }
            else
                if (vothom<=0.66) {
                votantes [0][i]= '0';
                        }
            else
                if (vothom<=1.0){
                    votantes [0][i]= 'n';

                    }
            if  (votmuj<=0.33){
                 votantes [1][i]='0';
                }        
            else
                if (votmuj<=0.66){
                    votantes [1][i]= '1';
                }
            else
                if(votmuj<=1.0){
                    votantes[1][i]='n';
                }
            
            
            }
        for (int h=0;h<2;h++){
            for (int j=0;j<lim;j++){
                if (votantes [0][j]=='1'){
                 aprobHombres= aprobHombres +1;}
                     
                if (votantes [1][j]=='1'){
                aprobMujeres= aprobMujeres+1;
                }
                if (votantes [1][j]=='0'){
                    desapMujeres=desapMujeres+1;
                }
                
            }
        }
        int totalenc,totalaprob;
        double porcentaje;
        totalenc=lim*2;
        totalaprob= aprobHombres + aprobMujeres;
        porcentaje=(totalaprob*100)/totalenc;
        
        System.out.println("La cantidad de hombres que lo aprobaron es: "+aprobHombres);
        System.out.println("La cantidad de mujeres que lo desaprueban es: "+desapMujeres);
        System.out.println("El porcentaje de aprobado es: "+porcentaje);
        System.out.println("El total de encuestados es: "+totalenc);
     }         
    
}
