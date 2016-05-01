/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.example.gradle.db.information_schema.tables.Statistics;
import org.jooq.impl.TableRecordImpl;


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
public class StatisticsRecord extends TableRecordImpl<StatisticsRecord> implements Record16<String, String, String, Long, String, String, Long, String, String, Long, Long, String, String, String, String, String> {

	private static final long serialVersionUID = -1051537340;

	/**
	 * Setter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
	 */
	public String getTableCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
	 */
	public void setTableName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
	 */
	public String getTableName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
	 */
	public void setNonUnique(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
	 */
	public Long getNonUnique() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
	 */
	public void setIndexSchema(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
	 */
	public String getIndexSchema() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
	 */
	public void setIndexName(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
	 */
	public String getIndexName() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
	 */
	public void setSeqInIndex(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
	 */
	public Long getSeqInIndex() {
		return (Long) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
	 */
	public void setColumnName(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
	 */
	public String getColumnName() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.COLLATION</code>.
	 */
	public void setCollation(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.COLLATION</code>.
	 */
	public String getCollation() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.CARDINALITY</code>.
	 */
	public void setCardinality(Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.CARDINALITY</code>.
	 */
	public Long getCardinality() {
		return (Long) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.SUB_PART</code>.
	 */
	public void setSubPart(Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.SUB_PART</code>.
	 */
	public Long getSubPart() {
		return (Long) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.PACKED</code>.
	 */
	public void setPacked(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.PACKED</code>.
	 */
	public String getPacked() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.NULLABLE</code>.
	 */
	public void setNullable(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.NULLABLE</code>.
	 */
	public String getNullable() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
	 */
	public void setIndexType(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
	 */
	public String getIndexType() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.COMMENT</code>.
	 */
	public void setComment(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.COMMENT</code>.
	 */
	public String getComment() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
	 */
	public void setIndexComment(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
	 */
	public String getIndexComment() {
		return (String) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, String, String, Long, String, String, Long, String, String, Long, Long, String, String, String, String, String> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<String, String, String, Long, String, String, Long, String, String, Long, Long, String, String, String, String, String> valuesRow() {
		return (Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Statistics.STATISTICS.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Statistics.STATISTICS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Statistics.STATISTICS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return Statistics.STATISTICS.NON_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Statistics.STATISTICS.INDEX_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Statistics.STATISTICS.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field7() {
		return Statistics.STATISTICS.SEQ_IN_INDEX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Statistics.STATISTICS.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Statistics.STATISTICS.COLLATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field10() {
		return Statistics.STATISTICS.CARDINALITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field11() {
		return Statistics.STATISTICS.SUB_PART;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return Statistics.STATISTICS.PACKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return Statistics.STATISTICS.NULLABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return Statistics.STATISTICS.INDEX_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return Statistics.STATISTICS.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return Statistics.STATISTICS.INDEX_COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getNonUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getIndexSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value7() {
		return getSeqInIndex();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getCollation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value10() {
		return getCardinality();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value11() {
		return getSubPart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getPacked();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getNullable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getIndexType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getIndexComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value1(String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value2(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value3(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value4(Long value) {
		setNonUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value5(String value) {
		setIndexSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value6(String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value7(Long value) {
		setSeqInIndex(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value8(String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value9(String value) {
		setCollation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value10(Long value) {
		setCardinality(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value11(Long value) {
		setSubPart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value12(String value) {
		setPacked(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value13(String value) {
		setNullable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value14(String value) {
		setIndexType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value15(String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value16(String value) {
		setIndexComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord values(String value1, String value2, String value3, Long value4, String value5, String value6, Long value7, String value8, String value9, Long value10, Long value11, String value12, String value13, String value14, String value15, String value16) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatisticsRecord
	 */
	public StatisticsRecord() {
		super(Statistics.STATISTICS);
	}

	/**
	 * Create a detached, initialised StatisticsRecord
	 */
	public StatisticsRecord(String tableCatalog, String tableSchema, String tableName, Long nonUnique, String indexSchema, String indexName, Long seqInIndex, String columnName, String collation, Long cardinality, Long subPart, String packed, String nullable, String indexType, String comment, String indexComment) {
		super(Statistics.STATISTICS);

		setValue(0, tableCatalog);
		setValue(1, tableSchema);
		setValue(2, tableName);
		setValue(3, nonUnique);
		setValue(4, indexSchema);
		setValue(5, indexName);
		setValue(6, seqInIndex);
		setValue(7, columnName);
		setValue(8, collation);
		setValue(9, cardinality);
		setValue(10, subPart);
		setValue(11, packed);
		setValue(12, nullable);
		setValue(13, indexType);
		setValue(14, comment);
		setValue(15, indexComment);
	}
}
