.class public Ly8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/e$b;
    }
.end annotation


# instance fields
.field private a:Ly8/e$b;


# direct methods
.method public constructor <init>(Ly8/e$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly8/e;->a:Ly8/e$b;

    return-void
.end method

.method static synthetic a(Ly8/e;)Ly8/e$b;
    .locals 0

    iget-object p0, p0, Ly8/e;->a:Ly8/e$b;

    return-object p0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l;)V
    .locals 2

    .line 1
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->h()Landroidx/lifecycle/LiveData;

    move-result-object v0

    .line 2
    new-instance v1, Ly8/e$a;

    invoke-direct {v1, p0}, Ly8/e$a;-><init>(Ly8/e;)V

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/LiveData;->i(Landroidx/lifecycle/l;Landroidx/lifecycle/s;)V

    return-void
.end method
