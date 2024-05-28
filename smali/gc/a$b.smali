.class final Lgc/a$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgc/f<",
        "Lob/h0;",
        "Lob/h0;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lgc/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgc/a$b;

    invoke-direct {v0}, Lgc/a$b;-><init>()V

    sput-object v0, Lgc/a$b;->a:Lgc/a$b;

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

    check-cast p1, Lob/h0;

    invoke-virtual {p0, p1}, Lgc/a$b;->b(Lob/h0;)Lob/h0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lob/h0;)Lob/h0;
    .locals 0

    return-object p1
.end method
