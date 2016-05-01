/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.routines;


import com.mymock.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Takes a raw picoseconds value, and converts it to a human readable form.
 *  
 *  Picoseconds are the precision that all latency values are printed in 
 *  within Performance Schema, however are not user friendly when wanting
 *  to scan output from the command line.
 *  
 *  Parameters
 *  
 *  picoseconds (TEXT): 
 *  The raw picoseconds value to convert.
 *  
 *  Returns
 *  
 *  TEXT
 *  
 *  Example
 *  
 *  mysql> select format_time(342342342342345);
 *  +------------------------------+
 *  | format_time(342342342342345) |
 *  +------------------------------+
 *  | 00:05:42                     |
 *  +------------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql> select format_time(342342342);
 *  +------------------------+
 *  | format_time(342342342) |
 *  +------------------------+
 *  | 342.34 us              |
 *  +------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql> select format_time(34234);
 *  +--------------------+
 *  | format_time(34234) |
 *  +--------------------+
 *  | 34.23 ns           |
 *  +--------------------+
 *  1 row in set (0.00 sec)
 *  
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FormatTime extends AbstractRoutine<String> {

	private static final long serialVersionUID = -334440284;

	/**
	 * The parameter <code>sys.format_time.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * The parameter <code>sys.format_time.picoseconds</code>.
	 */
	public static final Parameter<String> PICOSECONDS = createParameter("picoseconds", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * Create a new routine call instance
	 */
	public FormatTime() {
		super("format_time", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PICOSECONDS);
	}

	/**
	 * Set the <code>picoseconds</code> parameter IN value to the routine
	 */
	public void setPicoseconds(String value) {
		setValue(PICOSECONDS, value);
	}

	/**
	 * Set the <code>picoseconds</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPicoseconds(Field<String> field) {
		setField(PICOSECONDS, field);
	}
}
