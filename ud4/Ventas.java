package ud4;

import java.util.*;

public class Ventas {
	
	//METHOD SELLER/NUMPRODUCTSOLD ROWS 10 COLUMNS
	
	public static int [][] ventasDistribuidor () {
		int [][] ventaXDistribuidor = new int [5][10];
		Random randomNum = new Random();
		
		for (int i=0; i<ventaXDistribuidor.length;i++) {
			for (int j=0; j<ventaXDistribuidor[i].length;j++) {
				ventaXDistribuidor[i][j] = randomNum.nextInt(201);
			}
		}
		return ventaXDistribuidor;
	}
	
	//METHOD PRICE 10 ARRAY
	
	public static double [] precio () {
		double [] precioProducto = new double [10];
		
		for (int i=0; i<precioProducto.length;i++) {
			precioProducto[i] = Math.random()*100;
		}
		return precioProducto;
	}
	
	//METHOD TO DETERMINE THE BEST NUMBER OF PRODUCTS BY SELLERS
	
	public int mejoresVentas (int[][] num)	{
		int ventasMax = 0;
		int vendedor =0;
		for (int i=0; i<num.length;i++) {
			int ventasTotalDistribuidor = 0;
			for (int j=0; j<num[i].length;j++) {
				ventasTotalDistribuidor += num[i][j];
			}
			if (ventasMax<ventasTotalDistribuidor) {
				ventasMax = ventasTotalDistribuidor;
				vendedor = i+1;
			}
		}
		return vendedor;
	}
	
	// BEST NUMBER OF PRODUCTS SOLD
	
	public int productoMasVendido (int [][] num) {
		int ventasMax=0;
		int producto=0;
		for (int i=0; i<num[0].length; i++) {
			int productoVendido=0;
			for (int j=0; j<num.length; i++) {
				productoVendido += num[j][i];
			}
			if (ventasMax<productoVendido) {
				ventasMax=productoVendido;
				producto = i+1;
			}
		}
		return producto;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VARS
		
		int[][] ventasXDistribuidor = ventasDistribuidor();
		double [] precioProducto = precio();
		double ventasTotalDistribuidor [] = new double [5];
		
		
		//TRAVERSE THE MATRICES AND ARRAYS
		
		for (int i=0; i<ventasXDistribuidor.length;i++) {
			
			for (int j=0; j<ventasXDistribuidor[i].length;j++) {
				ventasTotalDistribuidor[i] += (ventasXDistribuidor[i][j])*(precioProducto[i]); 
			}
			
			//CONDITIONS TO CALCULATE THE TOTAL AMOUNT SOLD, PERCENTAGE AND COMISSION
			
			if (ventasTotalDistribuidor[i]>30000&&ventasTotalDistribuidor[i]<=70000) {
				System.out.printf("Distribuidor: %s\tImporte Total de Ventas: %.2f€\tPorcentaje de Comisión: 5%%\tComisión: %.2f€\n", (i+1), ventasTotalDistribuidor[i], (ventasTotalDistribuidor[i]*5/100));
			} else if (ventasTotalDistribuidor[i]>70000) {
				System.out.printf("Distribuidor: %s\tImporte Total de Ventas: %.2f€\tPorcentaje de Comisión: 8%%\tComisión: %.2f€\n", (i+1), ventasTotalDistribuidor[i], (ventasTotalDistribuidor[i]*8/100));
			}
		}

	}
}
