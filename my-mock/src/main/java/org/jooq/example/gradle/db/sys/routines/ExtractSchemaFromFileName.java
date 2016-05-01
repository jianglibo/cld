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
 *  Takes a raw file path, and attempts to extract the schema name from it.
 *  
 *  Useful for when interacting with Performance Schema data 
 *  concerning IO statistics, for example.
 *  
 *  Currently relies on the fact that a table data file will be within a 
 *  specified database directory (will not work with partitions or tables
 *  that specify an individual DATA_DIRECTORY).
 *  
 *  Parameters
 *  
 *  path (VARCHAR(512)):
 *  The full file path to a data file to extract the schema name from.
 *  
 *  Returns
 *  
 *  VARCHAR(64)
 *  
 *  Example
 *  
 *  mysql> SELECT sys.extract_schema_from_file_name('/var/lib/mysql/employees/employee.ibd');
 *  +----------------------------------------------------------------------------+
 *  | sys.extract_schema_from_file_name('/var/lib/mysql/employees/employee.ibd') 
 * |
 *  +----------------------------------------------------------------------------+
 *  | employees                                                           
 *        |
 *  +----------------------------------------------------------------------------+
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
public class ExtractSchemaFromFileName extends AbstractRoutine<String> {

	private static final long serialVersionUID = -805331945;

	/**
	 * The parameter <code>sys.extract_schema_from_file_name.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(64), false);

	/**
	 * The parameter <code>sys.extract_schema_from_file_name.path</code>.
	 */
	public static final Parameter<String> PATH = createParameter("path", org.jooq.impl.SQLDataType.VARCHAR.length(512), false);

	/**
	 * Create a new routine call instance
	 */
	public ExtractSchemaFromFileName() {
		super("extract_schema_from_file_name", Sys.SYS, org.jooq.impl.SQLDataType.VARCHAR.length(64));

		setReturnParameter(RETURN_VALUE);
		addInParameter(PATH);
	}

	/**
	 * Set the <code>path</code> parameter IN value to the routine
	 */
	public void setPath(String value) {
		setValue(PATH, value);
	}

	/**
	 * Set the <code>path</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPath(Field<String> field) {
		setField(PATH, field);
	}
}
