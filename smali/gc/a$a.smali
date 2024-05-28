.class final Lgc/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/f<",
        "Lob/j0;",
        "Lob/j0;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lgc/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgc/a$a;

    invoke-direct {v0}, Lgc/a$a;-><init>()V

    sput-object v0, Lgc/a$a;->a:Lgc/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lob/j0;

    invoke-virtual {p0, p1}, Lgc/a$a;->b(Lob/j0;)Lob/j0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lob/j0;)Lob/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p1}, Lgc/y;->a(Lob/j0;)Lob/j0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    invoke-virtual {p1}, Lob/j0;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lob/j0;->close()V

    .line 3
    throw v0
.end method
