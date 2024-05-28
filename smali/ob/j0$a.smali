.class Lob/j0$a;
.super Lob/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lob/j0;->z(Lob/b0;JLac/e;)Lob/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lob/b0;

.field final synthetic p:J

.field final synthetic q:Lac/e;


# direct methods
.method constructor <init>(Lob/b0;JLac/e;)V
    .locals 0

    iput-object p1, p0, Lob/j0$a;->o:Lob/b0;

    iput-wide p2, p0, Lob/j0$a;->p:J

    iput-object p4, p0, Lob/j0$a;->q:Lac/e;

    invoke-direct {p0}, Lob/j0;-><init>()V

    return-void
.end method


# virtual methods
.method public Q()Lac/e;
    .locals 1

    iget-object v0, p0, Lob/j0$a;->q:Lac/e;

    return-object v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lob/j0$a;->p:J

    return-wide v0
.end method

.method public l()Lob/b0;
    .locals 1

    iget-object v0, p0, Lob/j0$a;->o:Lob/b0;

    return-object v0
.end method
