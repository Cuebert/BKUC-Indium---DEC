.class Lob/e$c;
.super Lob/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final o:Lqb/d$e;

.field private final p:Lac/e;

.field private final q:Ljava/lang/String;

.field private final r:Ljava/lang/String;


# direct methods
.method constructor <init>(Lqb/d$e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lob/j0;-><init>()V

    .line 2
    iput-object p1, p0, Lob/e$c;->o:Lqb/d$e;

    .line 3
    iput-object p2, p0, Lob/e$c;->q:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lob/e$c;->r:Ljava/lang/String;

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p1, p2}, Lqb/d$e;->c(I)Lac/t;

    move-result-object p2

    .line 6
    new-instance p3, Lob/e$c$a;

    invoke-direct {p3, p0, p2, p1}, Lob/e$c$a;-><init>(Lob/e$c;Lac/t;Lqb/d$e;)V

    invoke-static {p3}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object p1

    iput-object p1, p0, Lob/e$c;->p:Lac/e;

    return-void
.end method


# virtual methods
.method public Q()Lac/e;
    .locals 1

    iget-object v0, p0, Lob/e$c;->p:Lac/e;

    return-object v0
.end method

.method public i()J
    .locals 3

    const-wide/16 v0, -0x1

    :try_start_0
    iget-object v2, p0, Lob/e$c;->r:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-wide v0
.end method

.method public l()Lob/b0;
    .locals 1

    iget-object v0, p0, Lob/e$c;->q:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lob/b0;->d(Ljava/lang/String;)Lob/b0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
