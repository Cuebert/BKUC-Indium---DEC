.class Lo9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzb/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9/c;->a()Lob/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo9/c;


# direct methods
.method constructor <init>(Lo9/c;)V
    .locals 0

    iput-object p1, p0, Lo9/c$a;->a:Lo9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rbx.http"

    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
