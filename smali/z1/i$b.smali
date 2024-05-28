.class final Lz1/i$b;
.super Lz1/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lz1/o$c;

.field private b:Lz1/o$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz1/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lz1/o;
    .locals 4

    new-instance v0, Lz1/i;

    iget-object v1, p0, Lz1/i$b;->a:Lz1/o$c;

    iget-object v2, p0, Lz1/i$b;->b:Lz1/o$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lz1/i;-><init>(Lz1/o$c;Lz1/o$b;Lz1/i$a;)V

    return-object v0
.end method

.method public b(Lz1/o$b;)Lz1/o$a;
    .locals 0

    iput-object p1, p0, Lz1/i$b;->b:Lz1/o$b;

    return-object p0
.end method

.method public c(Lz1/o$c;)Lz1/o$a;
    .locals 0

    iput-object p1, p0, Lz1/i$b;->a:Lz1/o$c;

    return-object p0
.end method
