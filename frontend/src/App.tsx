import NavBar from "components/navbar";
import Footer from "components/footer";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutsChart from "components/DonutsChart";

function App() {
  return (
    <>
      <NavBar />
      <div className = "container">


        <h1 className="text-primary py-3">Dashboard de vendas</h1>
          <div className="row px-3">
            <div className="col-sm-6 ">
              <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
              <BarChart/> 
            </div>

            <div className="col-sm-6 ">
              <h5 className="text-center text-secondary">Todas vendas</h5>
              <DonutsChart/> 
            </div>

          </div>

          <div className="text-primary ">
            <h2>Todas vendas</h2>
          </div>

        <DataTable/>
      </div>

      <Footer/>
    </>
  );
}

export default App;
