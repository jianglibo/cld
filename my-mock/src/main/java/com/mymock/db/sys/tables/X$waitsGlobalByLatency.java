/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables;


import com.mymock.db.sys.Sys;
import com.mymock.db.sys.tables.records.X$waitsGlobalByLatencyRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$waitsGlobalByLatency extends TableImpl<X$waitsGlobalByLatencyRecord> {

	private static final long serialVersionUID = -1837963369;

	/**
	 * The reference instance of <code>sys.x$waits_global_by_latency</code>
	 */
	public static final X$waitsGlobalByLatency X$WAITS_GLOBAL_BY_LATENCY = new X$waitsGlobalByLatency();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$waitsGlobalByLatencyRecord> getRecordType() {
		return X$waitsGlobalByLatencyRecord.class;
	}

	/**
	 * The column <code>sys.x$waits_global_by_latency.events</code>.
	 */
	public final TableField<X$waitsGlobalByLatencyRecord, String> EVENTS = createField("events", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>sys.x$waits_global_by_latency.total</code>.
	 */
	public final TableField<X$waitsGlobalByLatencyRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$waits_global_by_latency.total_latency</code>.
	 */
	public final TableField<X$waitsGlobalByLatencyRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$waits_global_by_latency.avg_latency</code>.
	 */
	public final TableField<X$waitsGlobalByLatencyRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$waits_global_by_latency.max_latency</code>.
	 */
	public final TableField<X$waitsGlobalByLatencyRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>sys.x$waits_global_by_latency</code> table reference
	 */
	public X$waitsGlobalByLatency() {
		this("x$waits_global_by_latency", null);
	}

	/**
	 * Create an aliased <code>sys.x$waits_global_by_latency</code> table reference
	 */
	public X$waitsGlobalByLatency(String alias) {
		this(alias, X$WAITS_GLOBAL_BY_LATENCY);
	}

	private X$waitsGlobalByLatency(String alias, Table<X$waitsGlobalByLatencyRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$waitsGlobalByLatency(String alias, Table<X$waitsGlobalByLatencyRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$waitsGlobalByLatency as(String alias) {
		return new X$waitsGlobalByLatency(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$waitsGlobalByLatency rename(String name) {
		return new X$waitsGlobalByLatency(name, null);
	}
}
