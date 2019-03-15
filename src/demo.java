import code.MinimoComunMultiplo;
import code.VerificaNumerosAmigos;

public class demo {

		public static void main (String[] args) {
			
			numerosAmigos();
			minimoComunMultiplo();
			
		}
		
		public static void numerosAmigos() {
			VerificaNumerosAmigos vf = new VerificaNumerosAmigos();
			vf.verificador();
		}
		
		public static void minimoComunMultiplo() {
			MinimoComunMultiplo mcm = new MinimoComunMultiplo();
			int[] candidatos = {17, 23};
			int resultado = mcm.candidatosMcM(candidatos);
			System.out.println("el mínimo común múltiplo de los candidatos es: "+resultado);
		}
}
