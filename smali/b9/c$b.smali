.class Lb9/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field public static final a:Lb9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb9/c;-><init>(Lb9/c$a;)V

    sput-object v0, Lb9/c$b;->a:Lb9/c;

    return-void
.end method
