/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.performance_schema.PerformanceSchema;
import org.jooq.example.gradle.db.performance_schema.tables.records.ObjectsSummaryGlobalByTypeRecord;
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
public class ObjectsSummaryGlobalByType extends TableImpl<ObjectsSummaryGlobalByTypeRecord> {

	private static final long serialVersionUID = 1383553107;

	/**
	 * The reference instance of <code>performance_schema.objects_summary_global_by_type</code>
	 */
	public static final ObjectsSummaryGlobalByType OBJECTS_SUMMARY_GLOBAL_BY_TYPE = new ObjectsSummaryGlobalByType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ObjectsSummaryGlobalByTypeRecord> getRecordType() {
		return ObjectsSummaryGlobalByTypeRecord.class;
	}

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.OBJECT_TYPE</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.OBJECT_SCHEMA</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.OBJECT_NAME</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.COUNT_STAR</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.SUM_TIMER_WAIT</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.MIN_TIMER_WAIT</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.AVG_TIMER_WAIT</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.objects_summary_global_by_type.MAX_TIMER_WAIT</code>.
	 */
	public final TableField<ObjectsSummaryGlobalByTypeRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.objects_summary_global_by_type</code> table reference
	 */
	public ObjectsSummaryGlobalByType() {
		this("objects_summary_global_by_type", null);
	}

	/**
	 * Create an aliased <code>performance_schema.objects_summary_global_by_type</code> table reference
	 */
	public ObjectsSummaryGlobalByType(String alias) {
		this(alias, OBJECTS_SUMMARY_GLOBAL_BY_TYPE);
	}

	private ObjectsSummaryGlobalByType(String alias, Table<ObjectsSummaryGlobalByTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private ObjectsSummaryGlobalByType(String alias, Table<ObjectsSummaryGlobalByTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ObjectsSummaryGlobalByType as(String alias) {
		return new ObjectsSummaryGlobalByType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ObjectsSummaryGlobalByType rename(String name) {
		return new ObjectsSummaryGlobalByType(name, null);
	}
}