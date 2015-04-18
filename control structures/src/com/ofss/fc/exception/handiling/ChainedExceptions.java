package com.ofss.fc.exception.handiling;

public class ChainedExceptions {

	public static void main( String[] args){
		try{
		method1() ;
		}catch (Exception e) {
			e.printStackTrace() ;
		}
	}

	private static void method1() throws Exception {
		try{
			method2() ;
		}catch(Exception e){
			throw new Exception("Exception in method1", e) ;
		}
		
	}

	private static void method2() throws Exception {
		try{
			method3() ;
		}catch(Exception e){
			throw new Exception("Exception in method2", e) ;
		}
		
	}

	private static void method3() throws Exception {
		try{
			throw new Exception("Exception in method3") ;
		}catch( Exception e){
			throw e ;
		}
		
	}
	
	
}
