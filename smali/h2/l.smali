.class public final synthetic Lh2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lh2/r;

.field public final synthetic b:La2/o;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lh2/r;La2/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/l;->a:Lh2/r;

    iput-object p2, p0, Lh2/l;->b:La2/o;

    iput-wide p3, p0, Lh2/l;->c:J

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lh2/l;->a:Lh2/r;

    iget-object v1, p0, Lh2/l;->b:La2/o;

    iget-wide v2, p0, Lh2/l;->c:J

    invoke-static {v0, v1, v2, v3}, Lh2/r;->f(Lh2/r;La2/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
