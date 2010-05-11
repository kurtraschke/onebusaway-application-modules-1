package org.onebusaway.transit_data.model;

import java.util.ArrayList;
import java.util.List;

public class StopRouteScheduleBean extends ApplicationBean {

  private static final long serialVersionUID = 1L;

  private RouteBean route;

  private List<StopRouteDirectionScheduleBean> directions = new ArrayList<StopRouteDirectionScheduleBean>();

  public RouteBean getRoute() {
    return route;
  }

  public void setRoute(RouteBean route) {
    this.route = route;
  }

  public List<StopRouteDirectionScheduleBean> getDirections() {
    return directions;
  }

  public void setDirections(List<StopRouteDirectionScheduleBean> directions) {
    this.directions = directions;
  }
}