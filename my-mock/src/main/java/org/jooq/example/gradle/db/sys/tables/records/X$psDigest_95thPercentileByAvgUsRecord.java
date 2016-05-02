/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.example.gradle.db.sys.tables.X$psDigest_95thPercentileByAvgUs;
import org.jooq.impl.TableRecordImpl;


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
public class X$psDigest_95thPercentileByAvgUsRecord extends TableRecordImpl<X$psDigest_95thPercentileByAvgUsRecord> implements Record2<BigInteger, BigDecimal> {

	private static final long serialVersionUID = 1985545906;

	/**
	 * Setter for <code>sys.x$ps_digest_95th_percentile_by_avg_us.avg_us</code>.
	 */
	public void setAvgUs(BigInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$ps_digest_95th_percentile_by_avg_us.avg_us</code>.
	 */
	public BigInteger getAvgUs() {
		return (BigInteger) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$ps_digest_95th_percentile_by_avg_us.percentile</code>.
	 */
	public void setPercentile(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$ps_digest_95th_percentile_by_avg_us.percentile</code>.
	 */
	public BigDecimal getPercentile() {
		return (BigDecimal) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigInteger, BigDecimal> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigInteger, BigDecimal> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field1() {
		return X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US.AVG_US;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US.PERCENTILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value1() {
		return getAvgUs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getPercentile();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$psDigest_95thPercentileByAvgUsRecord value1(BigInteger value) {
		setAvgUs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$psDigest_95thPercentileByAvgUsRecord value2(BigDecimal value) {
		setPercentile(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$psDigest_95thPercentileByAvgUsRecord values(BigInteger value1, BigDecimal value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$psDigest_95thPercentileByAvgUsRecord
	 */
	public X$psDigest_95thPercentileByAvgUsRecord() {
		super(X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US);
	}

	/**
	 * Create a detached, initialised X$psDigest_95thPercentileByAvgUsRecord
	 */
	public X$psDigest_95thPercentileByAvgUsRecord(BigInteger avgUs, BigDecimal percentile) {
		super(X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US);

		setValue(0, avgUs);
		setValue(1, percentile);
	}
}