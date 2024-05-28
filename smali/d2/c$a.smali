.class public final Ld2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:Ld2/c$b;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Ld2/c$a;->a:J

    .line 3
    sget-object v0, Ld2/c$b;->o:Ld2/c$b;

    iput-object v0, p0, Ld2/c$a;->b:Ld2/c$b;

    return-void
.end method


# virtual methods
.method public a()Ld2/c;
    .locals 4

    new-instance v0, Ld2/c;

    iget-wide v1, p0, Ld2/c$a;->a:J

    iget-object v3, p0, Ld2/c$a;->b:Ld2/c$b;

    invoke-direct {v0, v1, v2, v3}, Ld2/c;-><init>(JLd2/c$b;)V

    return-object v0
.end method

.method public b(J)Ld2/c$a;
    .locals 0

    iput-wide p1, p0, Ld2/c$a;->a:J

    return-object p0
.end method

.method public c(Ld2/c$b;)Ld2/c$a;
    .locals 0

    iput-object p1, p0, Ld2/c$a;->b:Ld2/c$b;

    return-object p0
.end method
