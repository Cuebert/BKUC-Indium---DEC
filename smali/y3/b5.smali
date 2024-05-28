.class public final Ly3/b5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ly3/o6;

.field private final b:Ly3/y4;

.field private final c:Ly3/t4;


# direct methods
.method synthetic constructor <init>(Ly3/a5;Ly3/z4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ly3/a5;->g(Ly3/a5;)Ly3/o6;

    move-result-object p2

    iput-object p2, p0, Ly3/b5;->a:Ly3/o6;

    invoke-static {p1}, Ly3/a5;->b(Ly3/a5;)Ly3/y4;

    move-result-object p2

    iput-object p2, p0, Ly3/b5;->b:Ly3/y4;

    invoke-static {p1}, Ly3/a5;->a(Ly3/a5;)Ly3/t4;

    move-result-object p1

    iput-object p1, p0, Ly3/b5;->c:Ly3/t4;

    return-void
.end method


# virtual methods
.method public final a()Ly3/t4;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x32
    .end annotation

    iget-object v0, p0, Ly3/b5;->c:Ly3/t4;

    return-object v0
.end method

.method public final b()Ly3/y4;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Ly3/b5;->b:Ly3/y4;

    return-object v0
.end method

.method public final c()Ly3/o6;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Ly3/b5;->a:Ly3/o6;

    return-object v0
.end method
