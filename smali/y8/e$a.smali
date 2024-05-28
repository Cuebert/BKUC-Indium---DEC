.class Ly8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/e;->b(Landroidx/lifecycle/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/s<",
        "Ly8/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ly8/e;


# direct methods
.method constructor <init>(Ly8/e;)V
    .locals 0

    iput-object p1, p0, Ly8/e$a;->a:Ly8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ly8/f;

    invoke-virtual {p0, p1}, Ly8/e$a;->b(Ly8/f;)V

    return-void
.end method

.method public b(Ly8/f;)V
    .locals 1

    iget-object v0, p0, Ly8/e$a;->a:Ly8/e;

    invoke-static {v0}, Ly8/e;->a(Ly8/e;)Ly8/e$b;

    move-result-object v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lb9/c;->j:Ly8/f;

    :goto_0
    invoke-interface {v0, p1}, Ly8/e$b;->U(Ly8/f;)V

    return-void
.end method
