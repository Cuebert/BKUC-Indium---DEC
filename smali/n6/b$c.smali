.class Ln6/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field static final a:Ln6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln6/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln6/b;-><init>(Ln6/b$a;)V

    sput-object v0, Ln6/b$c;->a:Ln6/b;

    return-void
.end method
