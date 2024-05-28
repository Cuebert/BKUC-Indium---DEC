.class final Lb5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/c;


# instance fields
.field private final a:Lb5/t;

.field private final b:Lb5/x;


# direct methods
.method constructor <init>(Lb5/t;Lb5/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/h;->a:Lb5/t;

    iput-object p2, p0, Lb5/h;->b:Lb5/x;

    return-void
.end method


# virtual methods
.method public final a(Lb5/c$a;)Lg4/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb5/c$a;",
            ")",
            "Lg4/l<",
            "Lb5/c$c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lb5/h;->a:Lb5/t;

    invoke-virtual {p1}, Lb5/c$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lb5/t;->d(J)Lg4/l;

    move-result-object v0

    new-instance v1, Lb5/g;

    invoke-direct {v1, p0, p1}, Lb5/g;-><init>(Lb5/h;Lb5/c$a;)V

    .line 2
    invoke-virtual {v0, v1}, Lg4/l;->p(Lg4/k;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method final synthetic b(Lb5/c$a;Ljava/lang/Long;)Lg4/l;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v1, p0, Lb5/h;->b:Lb5/x;

    invoke-virtual {p1}, Lb5/c$a;->a()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    new-instance p1, Lb5/w;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lb5/w;-><init>(Lb5/x;JJ)V

    .line 2
    invoke-static {p1}, Lg4/o;->f(Ljava/lang/Object;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
