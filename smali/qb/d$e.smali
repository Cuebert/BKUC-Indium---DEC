.class public final Lqb/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:J

.field private final p:[Lac/t;

.field private final q:[J

.field final synthetic r:Lqb/d;


# direct methods
.method constructor <init>(Lqb/d;Ljava/lang/String;J[Lac/t;[J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqb/d$e;->r:Lqb/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lqb/d$e;->n:Ljava/lang/String;

    .line 3
    iput-wide p3, p0, Lqb/d$e;->o:J

    .line 4
    iput-object p5, p0, Lqb/d$e;->p:[Lac/t;

    .line 5
    iput-object p6, p0, Lqb/d$e;->q:[J

    return-void
.end method


# virtual methods
.method public b()Lqb/d$c;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lqb/d$e;->r:Lqb/d;

    iget-object v1, p0, Lqb/d$e;->n:Ljava/lang/String;

    iget-wide v2, p0, Lqb/d$e;->o:J

    invoke-virtual {v0, v1, v2, v3}, Lqb/d;->O(Ljava/lang/String;J)Lqb/d$c;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Lac/t;
    .locals 1

    iget-object v0, p0, Lqb/d$e;->p:[Lac/t;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lqb/d$e;->p:[Lac/t;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 2
    invoke-static {v3}, Lpb/e;->g(Ljava/io/Closeable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
