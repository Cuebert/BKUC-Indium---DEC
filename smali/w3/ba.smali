.class public final Lw3/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/z9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lw3/ba;)Lw3/c1;
    .locals 0

    iget-object p0, p0, Lw3/ba;->a:Lw3/c1;

    return-object p0
.end method


# virtual methods
.method public final b(Lw3/c1;)Lw3/ba;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c1<",
            "Lw3/z9;",
            ">;)",
            "Lw3/ba;"
        }
    .end annotation

    iput-object p1, p0, Lw3/ba;->a:Lw3/c1;

    return-object p0
.end method

.method public final c()Lw3/ca;
    .locals 2

    new-instance v0, Lw3/ca;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw3/ca;-><init>(Lw3/ba;Lw3/aa;)V

    return-object v0
.end method
