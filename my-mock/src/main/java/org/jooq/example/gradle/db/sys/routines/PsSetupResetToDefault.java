/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.routines;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Resets the Performance Schema setup to the default settings.
 *  
 *  Parameters
 *  
 *  in_verbose (BOOLEAN):
 *  Whether to print each setup stage (including the SQL) whilst running.
 *  
 *  Example
 *  
 *  mysql> CALL sys.ps_setup_reset_to_default(true)\G
 *  *************************** 1. row ***************************
 *  status: Resetting: setup_actors
 *  DELETE
 *  FROM performance_schema.setup_actors
 *  WHERE NOT (HOST = '%' AND USER = '%' AND ROLE = '%')
 *  1 row in set (0.00 sec)
 *  
 *  *************************** 1. row ***************************
 *  status: Resetting: setup_actors
 *  INSERT IGNORE INTO performance_schema.setup_actors
 *  VALUES ('%', '%', '%')
 *  1 row in set (0.00 sec)
 *  ...
 *  
 *  mysql> CALL sys.ps_setup_reset_to_default(false)G
 *  Query OK, 0 rows affected (0.00 sec)
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
public class PsSetupResetToDefault extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 12840687;

	/**
	 * The parameter <code>sys.ps_setup_reset_to_default.in_verbose</code>.
	 */
	public static final Parameter<Byte> IN_VERBOSE = createParameter("in_verbose", org.jooq.impl.SQLDataType.TINYINT, false);

	/**
	 * Create a new routine call instance
	 */
	public PsSetupResetToDefault() {
		super("ps_setup_reset_to_default", Sys.SYS);

		addInParameter(IN_VERBOSE);
	}

	/**
	 * Set the <code>in_verbose</code> parameter IN value to the routine
	 */
	public void setInVerbose(Byte value) {
		setValue(IN_VERBOSE, value);
	}
}