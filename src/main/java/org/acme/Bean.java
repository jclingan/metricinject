package org.acme;

import javax.enterprise.context.Dependent;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Gauge;

@Dependent
public class Bean {
    int invocations;

    @Gauge(absolute=true, name = "BeanInvocations", unit=MetricUnits.NONE)
	public int getInvocations() {
		return ++invocations;
	}

	public void setInvocations(int invocations) {
		this.invocations = invocations;
	}
}