.class final Lz1/e$b;
.super Lz1/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lz1/k$b;

.field private b:Lz1/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz1/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lz1/k;
    .locals 4

    new-instance v0, Lz1/e;

    iget-object v1, p0, Lz1/e$b;->a:Lz1/k$b;

    iget-object v2, p0, Lz1/e$b;->b:Lz1/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lz1/e;-><init>(Lz1/k$b;Lz1/a;Lz1/e$a;)V

    return-object v0
.end method

.method public b(Lz1/a;)Lz1/k$a;
    .locals 0

    iput-object p1, p0, Lz1/e$b;->b:Lz1/a;

    return-object p0
.end method

.method public c(Lz1/k$b;)Lz1/k$a;
    .locals 0

    iput-object p1, p0, Lz1/e$b;->a:Lz1/k$b;

    return-object p0
.end method
