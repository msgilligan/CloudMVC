#!/bin/sh
curl -w "\ntime_total = %{time_total}\n" http://cloudmvc.appspot.com/gaelykController -o /dev/null 