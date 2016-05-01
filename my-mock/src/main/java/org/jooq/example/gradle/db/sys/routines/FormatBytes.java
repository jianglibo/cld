/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Takes a raw bytes value, and converts it to a human readable format.
 *  
 *  Parameters
 *  
 *  bytes (TEXT):
 *  A raw bytes value.
 *  
 *  Returns
 *  
 *  TEXT
 *  
 *  Example
 *  
 *  mysql> SELECT sys.format_bytes(2348723492723746) AS size;
 *  +----------+
 *  | size     |
 *  +----------+
 *  | 2.09 PiB |
 *  +----------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql> SELECT sys.format_bytes(2348723492723) AS size;
 *  +----------+
 *  | size     |
 *  +----------+
 *  | 2.14 TiB |
 *  +----------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql> SELECT sys.format_bytes(23487234) AS size;
 *  +-----------+
 *  | size      |
 *  +-----------+
 *  | 22.40 MiB |
 *  +-----------+
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
public class FormatBytes extends AbstractRoutine<String> {

	private static final long serialVersionUID = -805158406;

	/**
	 * The parameter <code>sys.format_bytes.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * The parameter <code>sys.format_bytes.bytes</code>.
	 */
	public static final Parameter<String> BYTES = createParameter("bytes", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * Create a new routine call instance
	 */
	public FormatBytes() {
		super("format_bytes", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(BYTES);
	}

	/**
	 * Set the <code>bytes</code> parameter IN value to the routine
	 */
	public void setBytes(String value) {
		setValue(BYTES, value);
	}

	/**
	 * Set the <code>bytes</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setBytes(Field<String> field) {
		setField(BYTES, field);
	}
}
