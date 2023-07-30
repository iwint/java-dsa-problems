/** @format */

const BASEURL = "https://jsonmock.hackerrank.com/api/football_matches";

const getAll = async (team, year) => {
     const res1 = await fetch(`${BASEURL}?year=${year}&team1=${team}&page=1`)
          .then((res) => res.json())
          .then((res) => res);

     const res2 = await fetch(`${BASEURL}?year=${year}&team2=${team}&page=1`)
          .then((res) => res.json())
          .then((res) => res);

     let total = 0;
     const goal1 = res1?.data?.forEach((i) => {
          total += parseInt(i.team1goals);
     });
     const goal2 = res2?.data?.forEach((i) => {
          total += parseInt(i.team2goals);
     });
     return total;
};

getAll("Barcelona", 2011);
