package tiendita;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruta fru1 = new Fruta ("Manzana", 82.5, 20, "Rojo");
		Fruta fru2 = new Fruta ("pitaya", 45.86, 50, "rosa");
		Lacteo lac1 = new Lacteo("leche lala", 12.5,2 , 25);
		Lacteo lac2= new Lacteo("Leche nido", 50.1,25, 36);
		Limpieza lim1 = new Limpieza ("Trapeador", 10.5, "nose", 41);
		Limpieza lim2 = new Limpieza ("Escoba", 13.5, "tampocose", 64);
		NoParecible nopa1 = new NoParecible ("Aqui va algo!", 52.4, 54, 20);
		NoParecible nopa2 = new NoParecible("Aqui tambien va algo", 451.1, 50,70);
		
		//se hace una instancia para el array
		Producto[] produc = new Producto[8];
		
		produc[0]= fru1;
		produc[1]= fru2;
		produc[2]=lac1;
		produc[3]=lac2;
		produc[4]= lim1;
		produc[5]=lim2;
		produc[6]=nopa1;
		produc[7]=nopa2;
		
		
		for(Producto product : produc) {
			System.out.println("Dame el nombre del producto"+ product.getNombre());
			System.out.println("Dame el precio"+ product.getPrecio());
			
			if(product instanceof Fruta) {
				//un casteo es convertir un tipo de dato a otro, por ejemplo un string a otro
				System.out.println("Peso:"+ ((Fruta) product).getPeso());
				System.out.println("Color"+ ((Fruta) product).getColor());
			}else if(product instanceof Lacteo) {
				System.out.println("Proteinas:" +((Lacteo) product).getProteinas());
				System.out.println("Cantidad:" +((Lacteo) product).getCantidad());
			}else if(product instanceof Limpieza ){
				System.out.println("Componentes" +((Limpieza) product).getComponentes());
				System.out.println("Litros" +((Limpieza) product).getLitros());
			}else if( product instanceof NoParecible) {
				System.out.println("Contenido" +((NoParecible) product).getContenido());
				System.out.println("Calorias"+ ((NoParecible) product).getCalorias());
			}
		}
	
	}

}
