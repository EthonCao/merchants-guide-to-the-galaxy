package com.galaxy.now.dataHandler;

import java.util.List;

import com.galaxy.now.service.AbstractDataConverter;
import com.galaxy.now.service.impl.GalaxyDataConverter;
import com.galaxy.now.service.impl.RomanDataConverter;

/**
 * Convert Galaxy values to Arabic
 *  
 * <p>Title: Converter_pre</p>  
 * <p>Description: </p>  
 * @author Cao
 * @date 2019年8月23日
 */
public class Converter_pre {
	
	private AbstractDataConverter dataConverter;
	
	public Converter_pre() {
	}

	public double convertInputValues(String theInput) throws Exception {
		List<Object> aRomanValueList = getRomanValues(theInput);
		if (aRomanValueList == null || aRomanValueList.isEmpty()) {
			return 0;
		} else {
			return getResult(aRomanValueList);
			
		}
	}
	
	/**
	 * Converts the Galactic units to Roman values using {@link IntergalacticConversion}
	 * @param theInput
	 * @return
	 */
	private List<Object> getRomanValues(String theInput) {
		/*IntergalacticConversion anIntergalacticConversion = new IntergalacticConversion();
		return anIntergalacticConversion.convertIntergalacticToRoman(theInput);*/
		dataConverter = new GalaxyDataConverter<>();
		return (List<Object>) dataConverter.converter(theInput);
	}
	
	/**
	 * converts the Roman values to Arabic values using {@link RomanConversion}
	 * @param aRomanValueList
	 * @return
	 */
	private double getResult(List<Object> aRomanValueList) {
		/*RomanConversion aRomanConvertor = new RomanConversion();
		return aRomanConvertor
				.convertRomanNumerialToValue(aRomanValueList);*/
		dataConverter = new RomanDataConverter<>();
		return (double) dataConverter.converter(aRomanValueList);
	}
}
