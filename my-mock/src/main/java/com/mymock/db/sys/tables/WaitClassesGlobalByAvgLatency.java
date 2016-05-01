/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables;


import com.mymock.db.sys.Sys;
import com.mymock.db.sys.tables.records.WaitClassesGlobalByAvgLatencyRecord;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class WaitClassesGlobalByAvgLatency extends TableImpl<WaitClassesGlobalByAvgLatencyRecord> {

	private static final long serialVersionUID = -2028320886;

	/**
	 * The reference instance of <code>sys.wait_classes_global_by_avg_latency</code>
	 */
	public static final WaitClassesGlobalByAvgLatency WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = new WaitClassesGlobalByAvgLatency();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<WaitClassesGlobalByAvgLatencyRecord> getRecordType() {
		return WaitClassesGlobalByAvgLatencyRecord.class;
	}

	/**
	 * The column <code>sys.wait_classes_global_by_avg_latency.event_class</code>.
	 */
	public final TableField<WaitClassesGlobalByAvgLatencyRecord, String> EVENT_CLASS = createField("event_class", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>sys.wait_classes_global_by_avg_latency.total</code>.
	 */
	public final TableField<WaitClassesGlobalByAvgLatencyRecord, BigInteger> TOTAL = createField("total", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.wait_classes_global_by_avg_latency.total_latency</code>.
	 */
	public final TableField<WaitClassesGlobalByAvgLatencyRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.wait_classes_global_by_avg_latency.min_latency</code>.
	 */
	public final TableField<WaitClassesGlobalByAvgLatencyRecord, String> MIN_LATENCY = createField("min_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.wait_classes_global_by_avg_latency.avg_latency</code>.
	 */
	public final TableField<WaitClassesGlobalByAvgLatencyRecord, String> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.wait_classes_global_by_avg_latency.max_latency</code>.
	 */
	public final TableField<WaitClassesGlobalByAvgLatencyRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>sys.wait_classes_global_by_avg_latency</code> table reference
	 */
	public WaitClassesGlobalByAvgLatency() {
		this("wait_classes_global_by_avg_latency", null);
	}

	/**
	 * Create an aliased <code>sys.wait_classes_global_by_avg_latency</code> table reference
	 */
	public WaitClassesGlobalByAvgLatency(String alias) {
		this(alias, WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
	}

	private WaitClassesGlobalByAvgLatency(String alias, Table<WaitClassesGlobalByAvgLatencyRecord> aliased) {
		this(alias, aliased, null);
	}

	private WaitClassesGlobalByAvgLatency(String alias, Table<WaitClassesGlobalByAvgLatencyRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WaitClassesGlobalByAvgLatency as(String alias) {
		return new WaitClassesGlobalByAvgLatency(alias, this);
	}

	/**
	 * Rename this table
	 */
	public WaitClassesGlobalByAvgLatency rename(String name) {
		return new WaitClassesGlobalByAvgLatency(name, null);
	}
}
