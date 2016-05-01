/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.performance_schema.PerformanceSchema;
import org.jooq.example.gradle.db.performance_schema.tables.records.EventsTransactionsSummaryGlobalByEventNameRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsTransactionsSummaryGlobalByEventName extends TableImpl<EventsTransactionsSummaryGlobalByEventNameRecord> {

	private static final long serialVersionUID = -286755673;

	/**
	 * The reference instance of <code>performance_schema.events_transactions_summary_global_by_event_name</code>
	 */
	public static final EventsTransactionsSummaryGlobalByEventName EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME = new EventsTransactionsSummaryGlobalByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsTransactionsSummaryGlobalByEventNameRecord> getRecordType() {
		return EventsTransactionsSummaryGlobalByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_WRITE</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> COUNT_READ_WRITE = createField("COUNT_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> SUM_TIMER_READ_WRITE = createField("SUM_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> MIN_TIMER_READ_WRITE = createField("MIN_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> AVG_TIMER_READ_WRITE = createField("AVG_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> MAX_TIMER_READ_WRITE = createField("MAX_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_ONLY</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> COUNT_READ_ONLY = createField("COUNT_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> SUM_TIMER_READ_ONLY = createField("SUM_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> MIN_TIMER_READ_ONLY = createField("MIN_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> AVG_TIMER_READ_ONLY = createField("AVG_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY</code>.
	 */
	public final TableField<EventsTransactionsSummaryGlobalByEventNameRecord, ULong> MAX_TIMER_READ_ONLY = createField("MAX_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_transactions_summary_global_by_event_name</code> table reference
	 */
	public EventsTransactionsSummaryGlobalByEventName() {
		this("events_transactions_summary_global_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_transactions_summary_global_by_event_name</code> table reference
	 */
	public EventsTransactionsSummaryGlobalByEventName(String alias) {
		this(alias, EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME);
	}

	private EventsTransactionsSummaryGlobalByEventName(String alias, Table<EventsTransactionsSummaryGlobalByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsTransactionsSummaryGlobalByEventName(String alias, Table<EventsTransactionsSummaryGlobalByEventNameRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryGlobalByEventName as(String alias) {
		return new EventsTransactionsSummaryGlobalByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsTransactionsSummaryGlobalByEventName rename(String name) {
		return new EventsTransactionsSummaryGlobalByEventName(name, null);
	}
}
