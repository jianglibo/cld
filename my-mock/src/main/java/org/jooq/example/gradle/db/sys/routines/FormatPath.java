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
 *  Takes a raw path value, and strips out the datadir or tmpdir
 *  replacing with @@datadir and @@tmpdir respectively. 
 *  
 *  Also normalizes the paths across operating systems, so backslashes
 *  on Windows are converted to forward slashes
 *  
 *  Parameters
 *  
 *  path (VARCHAR(512)):
 *  The raw file path value to format.
 *  
 *  Returns
 *  
 *  VARCHAR(512) CHARSET UTF8
 *  
 *  Example
 *  
 *  mysql> select @@datadir;
 *  +-----------------------------------------------+
 *  | @@datadir                                     |
 *  +-----------------------------------------------+
 *  | /Users/mark/sandboxes/SmallTree/AMaster/data/ |
 *  +-----------------------------------------------+
 *  1 row in set (0.06 sec)
 *  
 *  mysql> select format_path('/Users/mark/sandboxes/SmallTree/AMaster/data/mysql/proc.MYD') 
 * AS path;
 *  +--------------------------+
 *  | path                     |
 *  +--------------------------+
 *  | @@datadir/mysql/proc.MYD |
 *  +--------------------------+
 *  1 row in set (0.03 sec)
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
public class FormatPath extends AbstractRoutine<String> {

	private static final long serialVersionUID = 1533265278;

	/**
	 * The parameter <code>sys.format_path.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(512), false);

	/**
	 * The parameter <code>sys.format_path.path</code>.
	 */
	public static final Parameter<String> PATH = createParameter("path", org.jooq.impl.SQLDataType.VARCHAR.length(512), false);

	/**
	 * Create a new routine call instance
	 */
	public FormatPath() {
		super("format_path", Sys.SYS, org.jooq.impl.SQLDataType.VARCHAR.length(512));

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
