.class public final synthetic Lh2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lh2/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:La2/o;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lh2/r;Ljava/lang/Iterable;La2/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/n;->a:Lh2/r;

    iput-object p2, p0, Lh2/n;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lh2/n;->c:La2/o;

    iput-wide p4, p0, Lh2/n;->d:J

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lh2/n;->a:Lh2/r;

    iget-object v1, p0, Lh2/n;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lh2/n;->c:La2/o;

    iget-wide v3, p0, Lh2/n;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lh2/r;->e(Lh2/r;Ljava/lang/Iterable;La2/o;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
