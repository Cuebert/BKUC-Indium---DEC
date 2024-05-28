.class public final Ly3/a5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ly3/o6;

.field private b:Ly3/y4;

.field private c:Ly3/t4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Ly3/a5;)Ly3/t4;
    .locals 0

    iget-object p0, p0, Ly3/a5;->c:Ly3/t4;

    return-object p0
.end method

.method static synthetic b(Ly3/a5;)Ly3/y4;
    .locals 0

    iget-object p0, p0, Ly3/a5;->b:Ly3/y4;

    return-object p0
.end method

.method static synthetic g(Ly3/a5;)Ly3/o6;
    .locals 0

    iget-object p0, p0, Ly3/a5;->a:Ly3/o6;

    return-object p0
.end method


# virtual methods
.method public final c(Ly3/y4;)Ly3/a5;
    .locals 0

    iput-object p1, p0, Ly3/a5;->b:Ly3/y4;

    return-object p0
.end method

.method public final d(Ly3/t4;)Ly3/a5;
    .locals 0

    iput-object p1, p0, Ly3/a5;->c:Ly3/t4;

    return-object p0
.end method

.method public final e(Ly3/o6;)Ly3/a5;
    .locals 0

    iput-object p1, p0, Ly3/a5;->a:Ly3/o6;

    return-object p0
.end method

.method public final f()Ly3/b5;
    .locals 2

    new-instance v0, Ly3/b5;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly3/b5;-><init>(Ly3/a5;Ly3/z4;)V

    return-object v0
.end method
