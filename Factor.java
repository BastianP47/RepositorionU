public class Factor{
	
	public int CalcularRecursivo(int x){
		if(x>1){
			return x*calcularRecursivo(x-1);
		}else{
			return 1;
		}
	}
}