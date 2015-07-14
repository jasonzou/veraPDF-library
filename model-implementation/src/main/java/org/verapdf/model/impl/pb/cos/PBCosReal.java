package org.verapdf.model.impl.pb.cos;

import org.apache.pdfbox.cos.COSNumber;
import org.verapdf.model.coslayer.CosReal;

/**
 * Current class is representation of CosReal interface of abstract model.
 * All methods described in CosNumber. This class is analogue of COSFloat in pdfbox.
 *
 * @author Evgeniy Muravitskiy
 * @see PBCosNumber
 */
public class PBCosReal extends PBCosNumber implements CosReal {

	public PBCosReal(COSNumber value) {
		super(value);
		setType("CosReal");
	}
}