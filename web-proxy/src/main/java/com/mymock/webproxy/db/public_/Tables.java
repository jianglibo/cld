/**
 * This class is generated by jOOQ
 */
package com.mymock.webproxy.db.public_;


import com.mymock.webproxy.db.public_.tables.SchemaVersion;
import com.mymock.webproxy.db.public_.tables.Wpheader;
import com.mymock.webproxy.db.public_.tables.Wpurl;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table PUBLIC.schema_version
	 */
	public static final SchemaVersion SCHEMA_VERSION = com.mymock.webproxy.db.public_.tables.SchemaVersion.SCHEMA_VERSION;

	/**
	 * The table PUBLIC.WPURL
	 */
	public static final Wpurl WPURL = com.mymock.webproxy.db.public_.tables.Wpurl.WPURL;

	/**
	 * The table PUBLIC.WPHEADER
	 */
	public static final Wpheader WPHEADER = com.mymock.webproxy.db.public_.tables.Wpheader.WPHEADER;
}
